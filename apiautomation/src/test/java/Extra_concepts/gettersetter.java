package Extra_concepts;

import java.util.List;

public class gettersetter {

	 private String name;
		private String job;
		private String id;
		private List<String> skills;
		public String getName() {
			System.out.println("getter"+name);
			return name;
		}
		public void setName(String name) {
			System.out.println("setter"+name);
			this.name = name;
		}
		public String getJob() {
			System.out.println("getter"+job);
			return job;
		}
		public void setJob(String job) {
			System.out.println("setter"+job);
			this.job = job;
		}
		public String getId() {
			System.out.println("getter"+id);
			return id;
		}
		public void setId(String id) {
			System.out.println("setter"+id);
			this.id = id;
		}
		public List<String> getSkills() {
			System.out.println("getter"+skills);
			return skills;
		}
		public void setSkills(List<String> skills) {
			System.out.println("setter"+skills);
			this.skills = skills;
		}
}
