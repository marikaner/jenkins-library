import groovy.transform.Field

@Field String STEP_NAME = getClass().getName()
@Field String METADATA_FILE = 'metadata/integrationArtifactTriggerIntegrationTest.yaml'

void call(Map parameters = [:]) {
    List credentials = [
        [type: 'token', id: 'iFlowCredentialsId', env: ['PIPER_iFlowServiceKey']]
    ]
    piperExecuteBin(parameters, STEP_NAME, METADATA_FILE, credentials)
}
