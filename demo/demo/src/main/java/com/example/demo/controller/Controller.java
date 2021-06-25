package com.example.demo.controller;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private DocumentRepository documentRepository;

    List<Document> documents = new ArrayList<>();

    @RequestMapping("/")
    public String SpringBootSolrExample() {
        return "Welcome to Spring Boot solr Example";
    }

    @RequestMapping("/delete")
    public String deleteAllDocuments() {
        try {
            documentRepository.deleteAll();
            return "documents deleted succesfully!";
        }catch (Exception e){
            return "Failed to delete documents";
        }
    }
//    @RequestMapping("/save")
//    public String saveAllDocuments() {
//        //Store Documents
//        documentRepository.save(Arrays.asList(new Document("1", "pdf","Java Dev Zone"),
//                new Document("2", "msg", "subject:reinvetion"),
//                new Document("3", "pdf", "Spring boot sessions"),
//                new Document("4", "docx", "meeting agenda"),
//                new Document("5", "docx", "Spring boot + solr")));
//        return "5 documents saved!!!";
//    }
    @RequestMapping("/getAll")
    public List<Document> getAllDocs() {
//        List<Document> documents = new ArrayList<>();
        // iterate all documents and add it to list
        for (Document doc : this.documentRepository.findAll()) {
            documents.add(doc);
        }
        return documents;
    }

    @RequestMapping("/getById/{id}")
    public Optional<Document> getById(@PathVariable String id){
        return documentRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateById/{id}")
    public Document updateById(@RequestBody Document document, @PathVariable String id){
//        for(int i=0; i<documents.size(); i++){
//            Document d = documents.get(i);
//            if(d.getId().equals(id)) {
//                documents.set(i, document);
//
//                return document;
//            }
//        }
        documentRepository.save(document);
        return  document;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteById/{id}")
    public void deleteById(@PathVariable String id){
        documents.removeIf(t -> t.getId().equals(id));
    }
}