package chap06;

import java.util.List;

public interface BoardService {

	List<BoardVo> selectList(BoardVo vo);
	int count(BoardVo vo);
	int insert(BoardVo vo);
	BoardVo selectOne(int boardno);
	BoardVo2 selectOne2(int boardno);
	int update(BoardVo vo);
	int delete(BoardVo vo);
	List<BoardVo> selectList(String string, String string2);
}
