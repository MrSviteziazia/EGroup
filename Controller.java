class Controller {
    private EducationalGroupService groupService;

    public Controller(EducationalGroupService groupService) {
        this.groupService = groupService;
    }
    
    public EducationalGroup formEducationalGroup(Teacher teacher, List<Student> students) {
        return groupService.createEducationalGroup(teacher, students);
    }
}