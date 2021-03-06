
package us.kbase.narrativejobservice;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: app_state</p>
 * <pre>
 * job_id - id of job running app
 * job_state - 'queued', 'in-progress', 'completed', or 'suspend'
 * running_step_id - id of step currently running
 * step_outputs - mapping step_id to stdout text produced by step, only for completed or errored steps
 * step_outputs - mapping step_id to stderr text produced by step, only for completed or errored steps
 * step_job_ids - mapping from step_id to job_id
 * step_stats - mapping from step_id to execution time statistics
 * position - position of this job in execution waiting queue
 * submit_time, start_time and complete_time - time moments of submission, execution start and
 *     finish events formatted in ISO 8601 with UTC time-zone (like 2016-02-18T12:06:55Z).
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "job_id",
    "job_state",
    "running_step_id",
    "step_outputs",
    "step_errors",
    "step_job_ids",
    "step_stats",
    "is_deleted",
    "original_app",
    "submit_time",
    "start_time",
    "complete_time",
    "position"
})
public class AppState {

    @JsonProperty("job_id")
    private java.lang.String jobId;
    @JsonProperty("job_state")
    private java.lang.String jobState;
    @JsonProperty("running_step_id")
    private java.lang.String runningStepId;
    @JsonProperty("step_outputs")
    private Map<String, String> stepOutputs;
    @JsonProperty("step_errors")
    private Map<String, String> stepErrors;
    @JsonProperty("step_job_ids")
    private Map<String, String> stepJobIds;
    @JsonProperty("step_stats")
    private Map<String, StepStats> stepStats;
    @JsonProperty("is_deleted")
    private Long isDeleted;
    /**
     * <p>Original spec-file type: app</p>
     * 
     * 
     */
    @JsonProperty("original_app")
    private App originalApp;
    @JsonProperty("submit_time")
    private java.lang.String submitTime;
    @JsonProperty("start_time")
    private java.lang.String startTime;
    @JsonProperty("complete_time")
    private java.lang.String completeTime;
    @JsonProperty("position")
    private Long position;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("job_id")
    public java.lang.String getJobId() {
        return jobId;
    }

    @JsonProperty("job_id")
    public void setJobId(java.lang.String jobId) {
        this.jobId = jobId;
    }

    public AppState withJobId(java.lang.String jobId) {
        this.jobId = jobId;
        return this;
    }

    @JsonProperty("job_state")
    public java.lang.String getJobState() {
        return jobState;
    }

    @JsonProperty("job_state")
    public void setJobState(java.lang.String jobState) {
        this.jobState = jobState;
    }

    public AppState withJobState(java.lang.String jobState) {
        this.jobState = jobState;
        return this;
    }

    @JsonProperty("running_step_id")
    public java.lang.String getRunningStepId() {
        return runningStepId;
    }

    @JsonProperty("running_step_id")
    public void setRunningStepId(java.lang.String runningStepId) {
        this.runningStepId = runningStepId;
    }

    public AppState withRunningStepId(java.lang.String runningStepId) {
        this.runningStepId = runningStepId;
        return this;
    }

    @JsonProperty("step_outputs")
    public Map<String, String> getStepOutputs() {
        return stepOutputs;
    }

    @JsonProperty("step_outputs")
    public void setStepOutputs(Map<String, String> stepOutputs) {
        this.stepOutputs = stepOutputs;
    }

    public AppState withStepOutputs(Map<String, String> stepOutputs) {
        this.stepOutputs = stepOutputs;
        return this;
    }

    @JsonProperty("step_errors")
    public Map<String, String> getStepErrors() {
        return stepErrors;
    }

    @JsonProperty("step_errors")
    public void setStepErrors(Map<String, String> stepErrors) {
        this.stepErrors = stepErrors;
    }

    public AppState withStepErrors(Map<String, String> stepErrors) {
        this.stepErrors = stepErrors;
        return this;
    }

    @JsonProperty("step_job_ids")
    public Map<String, String> getStepJobIds() {
        return stepJobIds;
    }

    @JsonProperty("step_job_ids")
    public void setStepJobIds(Map<String, String> stepJobIds) {
        this.stepJobIds = stepJobIds;
    }

    public AppState withStepJobIds(Map<String, String> stepJobIds) {
        this.stepJobIds = stepJobIds;
        return this;
    }

    @JsonProperty("step_stats")
    public Map<String, StepStats> getStepStats() {
        return stepStats;
    }

    @JsonProperty("step_stats")
    public void setStepStats(Map<String, StepStats> stepStats) {
        this.stepStats = stepStats;
    }

    public AppState withStepStats(Map<String, StepStats> stepStats) {
        this.stepStats = stepStats;
        return this;
    }

    @JsonProperty("is_deleted")
    public Long getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("is_deleted")
    public void setIsDeleted(Long isDeleted) {
        this.isDeleted = isDeleted;
    }

    public AppState withIsDeleted(Long isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * <p>Original spec-file type: app</p>
     * 
     * 
     */
    @JsonProperty("original_app")
    public App getOriginalApp() {
        return originalApp;
    }

    /**
     * <p>Original spec-file type: app</p>
     * 
     * 
     */
    @JsonProperty("original_app")
    public void setOriginalApp(App originalApp) {
        this.originalApp = originalApp;
    }

    public AppState withOriginalApp(App originalApp) {
        this.originalApp = originalApp;
        return this;
    }

    @JsonProperty("submit_time")
    public java.lang.String getSubmitTime() {
        return submitTime;
    }

    @JsonProperty("submit_time")
    public void setSubmitTime(java.lang.String submitTime) {
        this.submitTime = submitTime;
    }

    public AppState withSubmitTime(java.lang.String submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    @JsonProperty("start_time")
    public java.lang.String getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }

    public AppState withStartTime(java.lang.String startTime) {
        this.startTime = startTime;
        return this;
    }

    @JsonProperty("complete_time")
    public java.lang.String getCompleteTime() {
        return completeTime;
    }

    @JsonProperty("complete_time")
    public void setCompleteTime(java.lang.String completeTime) {
        this.completeTime = completeTime;
    }

    public AppState withCompleteTime(java.lang.String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    @JsonProperty("position")
    public Long getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Long position) {
        this.position = position;
    }

    public AppState withPosition(Long position) {
        this.position = position;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((((((((((((((((("AppState"+" [jobId=")+ jobId)+", jobState=")+ jobState)+", runningStepId=")+ runningStepId)+", stepOutputs=")+ stepOutputs)+", stepErrors=")+ stepErrors)+", stepJobIds=")+ stepJobIds)+", stepStats=")+ stepStats)+", isDeleted=")+ isDeleted)+", originalApp=")+ originalApp)+", submitTime=")+ submitTime)+", startTime=")+ startTime)+", completeTime=")+ completeTime)+", position=")+ position)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
