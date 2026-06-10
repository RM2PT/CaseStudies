package com.example.microknowledgesystemservice.user;


import com.example.microknowledgesystemservice.comment.Comment;
import com.example.microknowledgesystemservice.microknowledge.MicroKnowledge;
import io.cucumber.java.mk_latn.No;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter @Setter @NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;

    @Column(unique = true)
    private String userId;
    private String name;
    private String uuid;
    private String role;  //i.e Reader


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "comment_reader_id")
    private Comment comment;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MicroKnowledge microKnowledge;

    /////////////
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "staredUser")
    private Set<MicroKnowledge> staredMicroKnowledge;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "userReadToComments")
    private Set<Comment> readerToComment;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "containedUser")
    private List<MicroKnowledge> containedMicroKnowledge;


}
