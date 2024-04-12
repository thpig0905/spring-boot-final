package kr.ex.gamearchive.service;

import kr.ex.gamearchive.domain.BoardDM;
import kr.ex.gamearchive.repository.BoardDMRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardDMService {

    private final BoardDMRepository boardDMRepository;

    public List<BoardDM> allBoardDM() {
        return boardDMRepository.findAll();
    }

    @Transactional
    public void addBoardDM(BoardDM boardDM) {
        boardDMRepository.save(boardDM);
    }
}
