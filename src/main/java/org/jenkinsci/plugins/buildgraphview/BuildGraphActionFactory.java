package org.jenkinsci.plugins.buildgraphview;

import hudson.Extension;
import hudson.model.*;
import jenkins.model.*;
import jenkins.model.Jenkins;

import java.util.Collection;
import java.util.Collections;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
@Extension
public class BuildGraphActionFactory extends TransientActionFactory<AbstractBuild> {

    @Override
    public Collection<? extends Action> createFor(AbstractBuild run) {
        return Collections.singleton(new BuildGraph(run));
    }

    @Override
    public Class<AbstractBuild> type() {
        return AbstractBuild.class;
    }
}
