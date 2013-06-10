package org.apache.tapestry.pages;

import javax.inject.Inject;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.PageActivationContext;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.internal.services.LinkSource;
import org.apache.tapestry5.upload.services.UploadedFile;

public class UploadTest
{
    @PageActivationContext
    @Property
    private String contextValue;

    @Property
    private UploadedFile uploadedFile;

    @Inject
    private LinkSource linkSource;

    @OnEvent("UploadException")
    UploadTest onUploadException(FileUploadException ex)
    {
        return this;
    }
}
