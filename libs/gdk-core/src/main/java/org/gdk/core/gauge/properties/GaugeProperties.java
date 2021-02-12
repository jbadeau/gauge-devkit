package org.gdk.core.gauge.properties;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class GaugeProperties {

    public Path getSpecDir() {
        return Path.of(System.getProperty("gauge_specs_dir"));
    }

    public Path getReportsDir() {
        return Path.of(System.getProperty("gauge_reports_dir"));
    }

    public Path getLogssDir() {
        return Path.of(System.getProperty("LogsDirectory"));
    }

    public boolean isOverwritesReports() {
        return Boolean.getBoolean(System.getProperty("overwrite_reports"));
    }

    public boolean isScreenshotOnFailure() {
        return Boolean.getBoolean(System.getProperty("screenshot_on_failure"));
    }

    public boolean isSaveExecutionResults() {
        return Boolean.getBoolean(System.getProperty("save_execution_result"));
    }

    public String getCsvDelimiter() {
        return System.getProperty("csv_delimiter");
    }

    public boolean isAllowMultilineStep() {
        return Boolean.getBoolean(System.getProperty("save_execution_result"));
    }

    public boolean isAllowScenarioDatatable() {
        return Boolean.getBoolean(System.getProperty("allowScenarioDatatable"));
    }

    public boolean isAllowFilteredParallelExecution() {
        return Boolean.getBoolean(System.getProperty("allowFilteredParallelExecution"));
    }

    public boolean isEnableMultithreading() {
        return Boolean.getBoolean(System.getProperty("enableMultithreading"));
    }

    public boolean getScreenshotsDir() {
        return Boolean.getBoolean(System.getProperty("gauge_screenshots_dir"));
    }

    public Set<String> getSpecFileExtensions() {
        return new HashSet<String>(Arrays.asList(System.getProperty("gauge_spec_file_extensions").split(", ")));
    }

}
