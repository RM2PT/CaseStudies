package com.example.microknowledgesystemservice.comment;

import com.example.microknowledgesystemservice.microknowledge.MicroKnowledge;
import com.example.microknowledgesystemservice.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    private String uuid;

    @JsonIgnore
    @CreationTimestamp
    private LocalDate writingTime;



    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "comment")
    private User commentToReader;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "commentMicroKnowledge")
    private MicroKnowledge commentToMicroKnowledge;

    //comment
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contain_comment_id")
    @JsonIgnore
    private MicroKnowledge microKnowledge;
//    private MicroKnowledge mk;

    //user relation
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reader_comment_id")
    private User userReadToComments;



}
