package javaposse.jobdsl.plugin.fixtures

import hudson.Extension
import hudson.model.Item
import hudson.model.Job
import hudson.triggers.Trigger
import hudson.triggers.TriggerDescriptor
import org.kohsuke.stapler.DataBoundConstructor

class Foo extends Trigger<Job> {
    @DataBoundConstructor
    Foo() {
    }

    @Extension
    static class DescriptorImpl extends TriggerDescriptor {
        final String displayName = null

        @Override
        boolean isApplicable(Item item) {
            false
        }
    }
}
