package com.random.ChatRoom.presentation.api;

import com.random.ChatRoom.core.chat.chatroom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatRoomController {

  private final ChatRoomService chatRoomService;

}
