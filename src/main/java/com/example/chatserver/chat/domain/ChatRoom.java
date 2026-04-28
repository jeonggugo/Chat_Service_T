package com.example.chatserver.chat.domain;

import com.example.chatserver.common.domain.BaseTimeEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ChatRoom extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Builder.Default
    private String isGroupChat = "N";
    @Builder.Default
    @OneToMany(mappedBy = "chatRoom", cascade = CascadeType.REMOVE)
    private List<ChatParticipant> chatParticipants = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "chatRoom", cascade = CascadeType.REMOVE)
    private List<ChatMessage> chatMessages = new ArrayList<>();


}
