package org.levvel.jenkins;

class PipelineBuilder implements Serializable
{
    def script
    def env
    def docker
    def image
  
    PipelineBuilder()
    {
        this.script = null
        this.env = null
    }

    def envDebug()
    {
        script.echo "PipelineBuilder >> envDebug() >> Debugging message"
    }

    def setDockerGlobalVar(docker)
    {
        this.docker = docker    
    }
    
    def setPipelineScriptObject(script)
    {
        this.script = script
    }
    
    def setPipelineEnvObject(env)
    {
        this.env = env
    }
    
    def checkoutSource()
    {
    	echo "Checking out source"
	}
	
	def buildWar()
	{
    	echo "Build War"
	}
	
	def runUnitTests()
	{
    	echo "Run Unit Tests"
	}
    
    def codeAnalysis()
    {
    	echo "Code Analysis"
	}
	
	def pushWarToArtifactRepo()
	{
    	echo "Push WAR to Artifact Repository"
	}
	
	def buildContainerImage()
	{
    	echo "Build Container Image"
	}
	
	def deployContainerImage()
	{
    	echo "Deploy Container Image"
	}
}
