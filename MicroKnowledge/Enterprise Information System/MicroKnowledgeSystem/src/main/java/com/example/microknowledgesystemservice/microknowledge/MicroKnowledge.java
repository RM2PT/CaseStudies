package com.example.microknowledgesystemservice.microknowledge;

import com.example.microknowledgesystemservice.comment.Comment;
import com.example.microknowledgesystemservice.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Set;

@Getter @Setter @NoArgsConstructor
@Entity
public class MicroKnowledge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String keywords;
    private Integer starNumber;
    private String uuid;
    private String content;

    @JsonIgnore
    @CreationTimestamp
    private ZonedDateTime createdAt; //our system created datetime i.e. for record

    @JsonIgnore
    @UpdateTimestamp
    private LocalDate lastUpdatedAt;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "belonged_user_id")
    @JsonIgnore
    private User belongedUser;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "microKnowledge")
    private Set<Comment> containedComment;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comment_micro_id")
    private Comment commentMicroKnowledge;


    //User relations
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stared_user_id")
    @JsonIgnore
    private User staredUser;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contain_user_id")
    @JsonIgnore
    private User containedUser;


}
