package org.webrtc;

import defpackage.fre;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

/* loaded from: classes2.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public VideoSource(long j) {
        super(j);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new CapturerObserver() { // from class: org.webrtc.VideoSource.1
            @Override // org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(z);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = z;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStarted(z);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = false;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStopped();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                VideoProcessor.FrameAdaptationParameters frameAdaptationParametersAdaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, frameAdaptationParametersAdaptFrame);
                            return;
                        }
                        VideoFrame videoFrameApplyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(videoFrame, frameAdaptationParametersAdaptFrame);
                        if (videoFrameApplyFrameAdaptationParameters != null) {
                            VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrameApplyFrameAdaptationParameters);
                            videoFrameApplyFrameAdaptationParameters.release();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(VideoFrame videoFrame) {
        runWithReference(new fre(this, 17, videoFrame));
    }

    public void adaptOutputFormat(int i, int i2, int i3) {
        int iMax = Math.max(i, i2);
        int iMin = Math.min(i, i2);
        adaptOutputFormat(iMax, iMin, iMin, iMax, i3);
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            try {
                VideoProcessor videoProcessor2 = this.videoProcessor;
                if (videoProcessor2 != null) {
                    videoProcessor2.setSink(null);
                    if (this.isCapturerRunning) {
                        this.videoProcessor.onCapturerStopped();
                    }
                }
                this.videoProcessor = videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.setSink(new VideoSink() { // from class: klf
                        @Override // org.webrtc.VideoSink
                        public final void onFrame(VideoFrame videoFrame) {
                            this.a.lambda$setVideoProcessor$1(videoFrame);
                        }
                    });
                    if (this.isCapturerRunning) {
                        videoProcessor.onCapturerStarted(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void adaptOutputFormat(int i, int i2, int i3, int i4, int i5) {
        adaptOutputFormat(new AspectRatio(i, i2), Integer.valueOf(i * i2), new AspectRatio(i3, i4), Integer.valueOf(i3 * i4), Integer.valueOf(i5));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
