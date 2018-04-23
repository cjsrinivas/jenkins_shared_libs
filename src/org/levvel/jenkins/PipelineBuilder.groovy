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
    	println "Checking out source"
	}
	
	def buildWar()
	{
    	println "Build War"
	}
	
	def runUnitTests()
	{
    	println "Run Unit Tests"
	}
    
    def codeAnalysis()
    {
    	println "Code Analysis"
	}
	
	def pushWarToArtifactRepo()
	{
    	println "Push WAR to Artifact Repository"
	}
	
	def buildContainerImage()
	{
    	println "Build Container Image"
	}
	
	def deployContainerImage()
	{
    	println "Deploy Container Image"
	}
}
