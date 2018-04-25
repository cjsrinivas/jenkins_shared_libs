import org.levvel.jenkins.PipelineBuilder

class BuildManager implements Serializable
{
	def call()
	{
	    // Any valid steps can be called from this code, just like in other
	    // Scripted Pipeline
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

    def buildAndDeployContainer(script, args = null)
    {
        def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.buildContainerImage()
        pipelineBldr.deployContainerImage()
    }
    
    def deployWarToAppServer(script, args = null)
    {
        def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.deployWarToAppServer()
    }
}
