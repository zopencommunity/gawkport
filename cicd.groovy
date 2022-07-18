node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'gawkport'), string(name: 'DESCRIPTION', 'gawkport' )]
        }
}
