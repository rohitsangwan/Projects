package com.example.demo.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;
@SolrDocument(collection = "Coll")

public class Document {
//    @Field
//    private String id;
    @Id
    @Field
    private String From;
    @Field
    private String Sentdate;
    @Field
    private String To;
    @Field
    private String CC;
    @Field
    private String BCC;
    @Field
    private String ContentType;
    @Field
    private String Subject;
    @Field
    private String MimeVersion;
    @Field
    private String MessageId;
//    @Field
//    private String Text;

    public Document() {
    }

    public Document(String Sentdate, String From, String To, String CC, String BCC, String ContentType, String Subject, String MimeVersion, String MessageId){
        //this.id = id;
        this.Sentdate = Sentdate;
        this.From = From;
        this.To = To;
        this.CC = CC;
        this.BCC = BCC;
        this.ContentType = ContentType;
        this.Subject = Subject;
        this.MimeVersion = MimeVersion;
        this.MessageId = MessageId;
        //this.Text = Text;
    }

    public void setId(String From){
        this.From = From;
    }

    public String getId(){
        return this.From;
    }
    @Override
    public String toString() {
        return "Document{" +
 //               "id='" + id + '\'' +
                " Sentdate='" + Sentdate + '\'' +
                ", From='" + From + '\'' +
                ", To='" + To + '\'' +
                ", CC='" + CC + '\'' +
                ", BCC='" + BCC + '\'' +
                ", Content-Type='" + ContentType + '\'' +
                ", Subject='" + Subject + '\'' +
                ", Mime-Version='" + MimeVersion + '\'' +
                ", MessageId='" + MessageId + '\'' +
 //               ", Text='" + Text + '\'' +
                '}';
    }
//    public String getid() {
//        return id;
//    }
//    public void setid(String id) {
//        this.id = id;
//    }
    public String getSentdate() {
        return Sentdate;
    }
    public void setSentdate(String Sentdate) {
        this.Sentdate = Sentdate;
    }
    public String getFrom() {
        return From;
    }
    public void setFrom(String From) {
        this.From = From;
    }
    public String getTo() {
        return To;
    }
    public void setTo(String To) {
        this.To = To;
    }
    public String getCC() {
        return CC;
    }
    public void setCC(String CC) {
        this.CC = CC;
    }
    public String getBCC() {
        return BCC;
    }
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }
    public String getContentType() {
        return ContentType;
    }
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    public String getMimeVersion() {
        return MimeVersion;
    }
    public void setMimeVersion(String MimeVersion) {
        this.MimeVersion = MimeVersion;
    }
    public String getMessageId() {
        return MessageId;
    }
    public void setMessageId(String MessageId) {this.MessageId = MessageId; }
//    public String getText() {
//        return Text;
//    }
//    public void setText(String Text) {this.Text = Text; }
}
