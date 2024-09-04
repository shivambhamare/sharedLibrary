// vars/checkoutCode.groovy

def call(String repoUrl = 'https://github.com/shivambhamare/CICD', String branchName = '*/main') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: branchName]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
