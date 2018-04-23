def call(body)
{
    sh '''
    #!/bin/bash
    echo "The working directory is ${WORKSPACE}"
    '''
}