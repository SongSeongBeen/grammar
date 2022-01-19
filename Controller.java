
//파라미터로 주는 방식     
@RequestMapping(value = "/view", method = { RequestMethod.GET, RequestMethod.POST })
		public String delete(@RequestParam(value="no") int no) {
			System.out.println("@RequestParam");
			System.out.println(no + "번글 가져오기");
	
			return "redirect:/phone/list";
		}

//주소를 변수 로 변경해서 주소값을 주는 방법 {} 앞,뒤 위치 상관없이 사용가능
@RequestMapping(value = "/{no}/{num}/view", method = { RequestMethod.GET, RequestMethod.POST })
public String delete(@PatVariable(value="no") @PatVariable("num")int num) {
	System.out.println("@PathVariable");
	System.out.println(no + "번글 가져오기");

	return "redirect:/phone/list";
}

//RequestParam 에 값이 없으면 디폴트로 정한 값을 부여
	@RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST })
	public String test(@RequestParam(value = "name") String name,
					   @RequestParam(value = "age", required = false, defaultValue = "-1") int age) {
		System.out.println("PhoneController>test");

		System.out.println(name);
		System.out.println(age);

		return "/WEB-INF/views/writeForm.jsp";
	}

