import org.levvel.jenkins.PipelineBuilder

class BuildManager implements Serializable
{
	def buildAndTestWar()
	{
    	def pipelineBldr = new PipelineBuilder()
        pipelineBldr.checkoutSource()
        pipelineBldr.buildWar()
        pipelineBldr.runUnitTests()
        pipelineBldr.codeAnalysis()
	}
	
    def pushWarToRepo()
    {
        def pipelineBldr = new PipelineBuilder()
        pipelineBldr.pushWarToArtifactRepo()
    }

    def buildAndDeployContainer()
    {
        def pipelineBldr = new PipelineBuilder()
        pipelineBldr.buildContainerImage()
        pipelineBldr.deployContainerImage()
    }
}
