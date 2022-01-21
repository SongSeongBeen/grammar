  // <!-- 컬럼명을 한번에 바꿔준다.  -->
	 <resultMap id="resultMapPersonVo" type="com.javaex.vo.PersonVo" >
	    <result column="person_id" property="personId" />  
	    <result column="name" property="name" />
	    <result column="hp" property="hp" />
	    <result column="company" property="company" />
	</resultMap>
	
// <!-- sql문 자바 문법  -->
	@Repository
	public class PhoneDao {

		@Autowired
		private SqlSession sqlSession;
		

		public List<PersonVo> getList() {
			List<PersonVo> list = sqlSession.selectList(“person.getList");
			return list;
		}
		
		public int insert(PersonVo vo) {
			return sqlSession.insert(“person.insert", vo);
		}
		
		public int delete(int psersonId) {
			int count = sqlSession.selectOne(“person.delete", psersonId);
					
			return count;
		}

	}

	sqlSession.insert(“person.insert", vo);

			sqlSession.update("person.update", vo);

			sqlSession.delete("person.delete", no);

			sqlSession.selectOne("person.getbyno", no);

			sqlSession.selectList("person.getlist");
