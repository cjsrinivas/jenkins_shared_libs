package org.levvel.jenkins;

class PipelineBuilder implements Serializable
{
  	def script = null;
  	
    PipelineBuilder(script)
    {
    	this.script = script
    }

    def envDebug()
    {
        script.echo "PipelineBuilder >> envDebug() >> Debugging message"
    }

    def checkoutSource()
    {
    	script.echo "Checking out source"
	}
	
	def buildWar()
	{
    	script.echo "Build War"
	}
	
	def runUnitTests()
	{
    	script.echo "Run Unit Tests"
	}
    
    def codeAnalysis()
    {
    	script.echo "Code Analysis"
	}
	
	def pushWarToArtifactRepo()
	{
    	script.echo "Push WAR to Artifact Repository"
	}
	
	def buildContainerImage()
	{
    	script.echo "Build Container Image"
	}
	
	def deployContainerImage()
	{
    	script.echo "Deploy Container Image"
	}
}
