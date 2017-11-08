package roche.fghsp.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Component {
	@Id
	private String id;
	
	private String hpsm_id;
	
	@NotNull
	private String name;
	
	private String description;
	
	@NotNull
	private String picture;

	private String servicenow_id;
	
	private String hpsm_name;
	
	private String hpsm_type;
	
	private String hpsm_status;
	
	private String hpsm_assigned_group;
	
	private String business_capabilities;
	
	private String bpo;
	
	private String coe;
	
	private String solution_architect;
	
	private String architecture;
	
	private String ba_application;
	
	private String technical_specialist;
	
	private String support_analyst;
	
	private String support_incidents;
	
	private String documentation;
	
	private String training_documentation;
	
	private String roadmap;
	
	private String access_type;
	
	private String technical_capabilities;
	
	private String related_component_id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the hpsm_id
	 */
	public String getHpsm_id() {
		return hpsm_id;
	}

	/**
	 * @param hpsm_id the hpsm_id to set
	 */
	public void setHpsm_id(String hpsm_id) {
		this.hpsm_id = hpsm_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * @return the servicenow_id
	 */
	public String getServicenow_id() {
		return servicenow_id;
	}

	/**
	 * @param servicenow_id the servicenow_id to set
	 */
	public void setServicenow_id(String servicenow_id) {
		this.servicenow_id = servicenow_id;
	}

	/**
	 * @return the hpsm_name
	 */
	public String getHpsm_name() {
		return hpsm_name;
	}

	/**
	 * @param hpsm_name the hpsm_name to set
	 */
	public void setHpsm_name(String hpsm_name) {
		this.hpsm_name = hpsm_name;
	}

	/**
	 * @return the hpsm_type
	 */
	public String getHpsm_type() {
		return hpsm_type;
	}

	/**
	 * @param hpsm_type the hpsm_type to set
	 */
	public void setHpsm_type(String hpsm_type) {
		this.hpsm_type = hpsm_type;
	}

	/**
	 * @return the hpsm_status
	 */
	public String getHpsm_status() {
		return hpsm_status;
	}

	/**
	 * @param hpsm_status the hpsm_status to set
	 */
	public void setHpsm_status(String hpsm_status) {
		this.hpsm_status = hpsm_status;
	}

	/**
	 * @return the hpsm_assigned_group
	 */
	public String getHpsm_assigned_group() {
		return hpsm_assigned_group;
	}

	/**
	 * @param hpsm_assigned_group the hpsm_assigned_group to set
	 */
	public void setHpsm_assigned_group(String hpsm_assigned_group) {
		this.hpsm_assigned_group = hpsm_assigned_group;
	}

	/**
	 * @return the business_capabilities
	 */
	public String getBusiness_capabilities() {
		return business_capabilities;
	}

	/**
	 * @param business_capabilities the business_capabilities to set
	 */
	public void setBusiness_capabilities(String business_capabilities) {
		this.business_capabilities = business_capabilities;
	}

	/**
	 * @return the bpo
	 */
	public String getBpo() {
		return bpo;
	}

	/**
	 * @param bpo the bpo to set
	 */
	public void setBpo(String bpo) {
		this.bpo = bpo;
	}

	/**
	 * @return the coe
	 */
	public String getCoe() {
		return coe;
	}

	/**
	 * @param coe the coe to set
	 */
	public void setCoe(String coe) {
		this.coe = coe;
	}

	/**
	 * @return the solution_architect
	 */
	public String getSolution_architect() {
		return solution_architect;
	}

	/**
	 * @param solution_architect the solution_architect to set
	 */
	public void setSolution_architect(String solution_architect) {
		this.solution_architect = solution_architect;
	}

	/**
	 * @return the architecture
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * @param architecture the architecture to set
	 */
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	/**
	 * @return the ba_application
	 */
	public String getBa_application() {
		return ba_application;
	}

	/**
	 * @param ba_application the ba_application to set
	 */
	public void setBa_application(String ba_application) {
		this.ba_application = ba_application;
	}

	/**
	 * @return the technical_specialist
	 */
	public String getTechnical_specialist() {
		return technical_specialist;
	}

	/**
	 * @param technical_specialist the technical_specialist to set
	 */
	public void setTechnical_specialist(String technical_specialist) {
		this.technical_specialist = technical_specialist;
	}

	/**
	 * @return the support_analyst
	 */
	public String getSupport_analyst() {
		return support_analyst;
	}

	/**
	 * @param support_analyst the support_analyst to set
	 */
	public void setSupport_analyst(String support_analyst) {
		this.support_analyst = support_analyst;
	}

	/**
	 * @return the support_incidents
	 */
	public String getSupport_incidents() {
		return support_incidents;
	}

	/**
	 * @param support_incidents the support_incidents to set
	 */
	public void setSupport_incidents(String support_incidents) {
		this.support_incidents = support_incidents;
	}

	/**
	 * @return the documentation
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * @param documentation the documentation to set
	 */
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	/**
	 * @return the training_documentation
	 */
	public String getTraining_documentation() {
		return training_documentation;
	}

	/**
	 * @param training_documentation the training_documentation to set
	 */
	public void setTraining_documentation(String training_documentation) {
		this.training_documentation = training_documentation;
	}

	/**
	 * @return the roadmap
	 */
	public String getRoadmap() {
		return roadmap;
	}

	/**
	 * @param roadmap the roadmap to set
	 */
	public void setRoadmap(String roadmap) {
		this.roadmap = roadmap;
	}

	/**
	 * @return the access_type
	 */
	public String getAccess_type() {
		return access_type;
	}

	/**
	 * @param access_type the access_type to set
	 */
	public void setAccess_type(String access_type) {
		this.access_type = access_type;
	}

	/**
	 * @return the technical_capabilities
	 */
	public String getTechnical_capabilities() {
		return technical_capabilities;
	}

	/**
	 * @param technical_capabilities the technical_capabilities to set
	 */
	public void setTechnical_capabilities(String technical_capabilities) {
		this.technical_capabilities = technical_capabilities;
	}

	/**
	 * @return the related_component_id
	 */
	public String getRelated_component_id() {
		return related_component_id;
	}

	/**
	 * @param related_component_id the related_component_id to set
	 */
	public void setRelated_component_id(String related_component_id) {
		this.related_component_id = related_component_id;
	}
	
}
