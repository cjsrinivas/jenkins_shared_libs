import org.levvel.jenkins.PipelineBuilder

class BuildManager implements Serializable
{
	def buildAndTestWar(script, args = null)
	{
    	def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.checkoutSource()
        pipelineBldr.buildWar()
        pipelineBldr.runUnitTests()
        pipelineBldr.codeAnalysis()
	}
	
    def pushWarToRepo(script, args)
    {
        def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.pushWarToArtifactRepo()
    }

    def buildAndDeployContainer(script, args)
    {
        def pipelineBldr = new PipelineBuilder(script)
        pipelineBldr.buildContainerImage()
        pipelineBldr.deployContainerImage()
    }
}
