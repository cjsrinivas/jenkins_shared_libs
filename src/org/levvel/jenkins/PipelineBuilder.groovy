package org.levvel.jenkins;

class PipelineBuilder implements Serializable
{
    def script
  
    PipelineBuilder(script)
    {
        this.script = script
        //this.envDebug()
    }

    def envDebug()
    {
        script.echo "PipelineBuilder >> envDebug() >> Debugging message"
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
