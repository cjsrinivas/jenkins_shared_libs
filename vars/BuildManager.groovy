import org.levvel.jenkins.PipelineBuilder

class BuildManager implements Serializable
{
	def call()
	{
	    // Any valid steps can be called from this code, just like in other
	    // Scripted Pipeline
	    echo "Hello World"
	}
	
	def buildAndTestWar(script, args = null)
	{
    	def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.checkoutSource()
        pipelineBldr.buildWar()
        pipelineBldr.runUnitTests()
        pipelineBldr.codeAnalysis()
	}
	
    def pushWarToRepo(script, args = null)
    {
        def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.pushWarToArtifactRepo()
    }

    //def buildAndDeployContainer(script, args = null)
    def buildAndDeployContainer(script)
    {
        def pipelineBldr = new PipelineBuilder(script)
        script.echo "Hello World"
        //pipelineBldr.envDebug()
        //pipelineBldr.buildContainerImage()
        //pipelineBldr.deployContainerImage()
    }
}
