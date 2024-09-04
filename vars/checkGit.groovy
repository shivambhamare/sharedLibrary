def call() 
{
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']],
        userRemoteConfigs: [[url: 'https://github.com/shivambhamare/CICD']]
    ])
}
