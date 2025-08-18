package ru.ok.android.externcalls.sdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import defpackage.a66;
import defpackage.au1;
import defpackage.ft0;
import defpackage.ire;
import defpackage.m56;
import defpackage.oe1;
import defpackage.tu0;
import defpackage.z84;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.webrtc.GlRectDrawer;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b¢\u0001£\u0001¤\u0001¥\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00192\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00192\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0012\u0018\u00010 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010,\u001a\u00020\u00192\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b,\u00102J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0019¢\u0006\u0004\b7\u0010&J\r\u00108\u001a\u00020\u0019¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b9\u0010&J\u0015\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0012¢\u0006\u0004\b;\u0010)J\u0015\u0010=\u001a\u00020\u00192\u0006\u0010<\u001a\u00020!¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bH\u0014¢\u0006\u0004\bA\u0010BJ7\u0010H\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u00192\u0006\u0010<\u001a\u00020!2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00192\u0006\u0010<\u001a\u00020!2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020\u0019H\u0002¢\u0006\u0004\bN\u0010&J\u000f\u0010O\u001a\u00020\u0019H\u0002¢\u0006\u0004\bO\u0010&J\u000f\u0010P\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010&J\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ?\u0010Y\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\b2\u0006\u0010W\u001a\u00020\b2\u0006\u0010X\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u00192\u0006\u0010[\u001a\u00020QH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020\bH\u0003¢\u0006\u0004\b`\u0010BJ\u000f\u0010a\u001a\u00020\u0019H\u0002¢\u0006\u0004\ba\u0010&R\u0014\u0010b\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010pR\u0016\u0010r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010sR.\u0010w\u001a\u0004\u0018\u00010u2\b\u0010v\u001a\u0004\u0018\u00010u8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010:\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010\u0080\u0001R*\u0010\u0082\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0080\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0080\u0001\u001a\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0016\u0010\u0085\u0001\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010mR\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010!0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u0017\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0090\u0001R'\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0012\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0080\u0001R(\u0010\u0094\u0001\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0080\u0001\u001a\u0006\b\u0095\u0001\u0010\u0083\u0001\"\u0005\b\u0096\u0001\u0010)R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R(\u0010\u009d\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u0080\u0001\u001a\u0006\b\u009e\u0001\u0010\u0083\u0001\"\u0005\b\u009f\u0001\u0010)R\u0017\u0010¡\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010\u0083\u0001¨\u0006¦\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer;", "Landroid/view/TextureView;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Loe1;", "renderer", "Lorg/webrtc/RendererCommon$RendererEvents;", "rendererEvents", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "", "init", "(Loe1;Lorg/webrtc/RendererCommon$RendererEvents;Lorg/webrtc/RendererCommon$GlDrawer;)Z", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "frameDecorator", "(Loe1;Lorg/webrtc/RendererCommon$RendererEvents;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)Z", "decorator", "Le5f;", "setFrameDecorator", "(Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "Lkotlin/Function2;", "listener", "setFrameSizeListener", "(La66;)V", "Lkotlin/Function1;", "Lorg/webrtc/VideoFrame;", "frameSkipCondition", "setFrameSkipCondition", "(Lm56;)V", "release", "()V", "mirror", "setMirror", "(Z)V", "Lorg/webrtc/RendererCommon$ScalingType;", "scalingType", "setScalingType", "(Lorg/webrtc/RendererCommon$ScalingType;)V", "setRenderEventsListener", "(Lorg/webrtc/RendererCommon$RendererEvents;)V", "scalingTypeMatchOrientation", "scalingTypeMismatchOrientation", "(Lorg/webrtc/RendererCommon$ScalingType;Lorg/webrtc/RendererCommon$ScalingType;)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "pauseVideo", "clearImage", "doRender", "setRender", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "widthSpec", "heightSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isPostponedFrame", "handleFrame", "(Lorg/webrtc/VideoFrame;Z)V", "postponeFrame", "dropPostponedFrameIfExists", "deliverPostponedFrame", "maybeReleaseLastSizeListener", "", "getResourceName", "()Ljava/lang/String;", "newWidth", "newHeight", "newRotatedFrameWidth", "newRotatedFrameHeight", "newFrameRotation", "updateFrameDimensionsAndReportEvents", "(IIIIIZ)Z", "string", "logD", "(Ljava/lang/String;)V", "width", "height", "updateTextureSize", "notifyTextureSizeChanged", "resourceName", "Ljava/lang/String;", "Lorg/webrtc/RendererCommon$VideoLayoutMeasure;", "videoLayoutMeasure", "Lorg/webrtc/RendererCommon$VideoLayoutMeasure;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "videoRenderer", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "Lorg/webrtc/RendererCommon$RendererEvents;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstFrameRendered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;", "rotatedFrameSize", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;", "measureFrameSize", "textureWidth", "I", "textureHeight", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "value", "sizeChangeListener", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "getSizeChangeListener", "()Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "setSizeChangeListener", "(Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;)V", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "Z", "<set-?>", "isInitialized", "()Z", "isReleased", "layoutReadyToRender", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "lastSizeListener", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "Ljava/util/concurrent/atomic/AtomicReference;", "postponedFrame", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/Runnable;", "postponedFrameSafeguard", "Ljava/lang/Runnable;", "deliverPostponedFrameRunnable", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "frameSkipPredicate", "Lm56;", "needsClearImage", "useAlternateLayout", "getUseAlternateLayout", "setUseAlternateLayout", "Landroid/graphics/Point;", "alternateLayoutOutPoint", "Landroid/graphics/Point;", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$PostponedFrameStatistics;", "postponedFrameStatistics", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$PostponedFrameStatistics;", "clearImageOnSizeChange", "getClearImageOnSizeChange", "setClearImageOnSizeChange", "getHasImage", "hasImage", "Companion", "FrameSize", "PostponedFrameStatistics", "SizeChangeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class TextureViewRenderer extends TextureView implements VideoSink, RendererView {
    private static final int MAX_SCALE_FACTOR = 2;
    private static final long POSTPONED_FRAME_SAFEGUARD_DELAY_MILLIS = 250;
    private static final long POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS = 20000;
    private static final String TAG = "TextureViewRenderer";
    private final Point alternateLayoutOutPoint;
    private boolean clearImageOnSizeChange;
    private final Runnable deliverPostponedFrameRunnable;
    private volatile boolean doRender;
    private FrameDecorator frameDecorator;
    private volatile m56 frameSkipPredicate;
    private final AtomicBoolean isFirstFrameRendered;
    private boolean isInitialized;
    private boolean isReleased;
    private VideoRendererInterface.FrameSizeListener lastSizeListener;
    private final AtomicBoolean layoutReadyToRender;
    private final FrameSize measureFrameSize;
    private volatile boolean needsClearImage;
    private final AtomicReference<VideoFrame> postponedFrame;
    private final Runnable postponedFrameSafeguard;
    private final PostponedFrameStatistics postponedFrameStatistics;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private final FrameSize rotatedFrameSize;
    private SizeChangeListener sizeChangeListener;
    private Surface surface;
    private int textureHeight;
    private int textureWidth;
    private boolean useAlternateLayout;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    private final VideoRendererInterface videoRenderer;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0013J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;", "", "", "rotatedFrameWidth", "rotatedFrameHeight", "frameRotation", "<init>", "(III)V", "width", "height", "rotation", "", "isPostponedFrame", "unsafeSet", "(IIIZ)Z", "set", "", "ratio", "()F", "()I", "size", "Le5f;", "get", "(Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;)V", "I", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class FrameSize {
        private int frameRotation;
        private int rotatedFrameHeight;
        private int rotatedFrameWidth;

        public FrameSize() {
            this(0, 0, 0, 7, null);
        }

        private final boolean unsafeSet(int width, int height, int rotation, boolean isPostponedFrame) {
            if (this.rotatedFrameWidth == width && this.rotatedFrameHeight == height && this.frameRotation == rotation) {
                return false;
            }
            if (!isPostponedFrame) {
                this.rotatedFrameWidth = width;
                this.rotatedFrameHeight = height;
                this.frameRotation = rotation;
            }
            return true;
        }

        public final synchronized void get(FrameSize size) {
            size.unsafeSet(this.rotatedFrameWidth, this.rotatedFrameHeight, this.frameRotation, false);
        }

        /* renamed from: height, reason: from getter */
        public final int getRotatedFrameHeight() {
            return this.rotatedFrameHeight;
        }

        public final float ratio() {
            return this.rotatedFrameWidth / this.rotatedFrameHeight;
        }

        public final synchronized boolean set(int width, int height, int rotation, boolean isPostponedFrame) {
            return unsafeSet(width, height, rotation, isPostponedFrame);
        }

        /* renamed from: width, reason: from getter */
        public final int getRotatedFrameWidth() {
            return this.rotatedFrameWidth;
        }

        public FrameSize(int i, int i2, int i3) {
            this.rotatedFrameWidth = i;
            this.rotatedFrameHeight = i2;
            this.frameRotation = i3;
        }

        public /* synthetic */ FrameSize(int i, int i2, int i3, int i4, z84 z84Var) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$PostponedFrameStatistics;", "", "<init>", "()V", "Le5f;", "logStatisticsIfNeeded", "", "value", "toPercent", "(D)D", "", "isPostponedFrame", "postponed", "(Z)V", "delivered", "dropped", "rejected", "", "postponedCount", "J", "repostponedCount", "deliveredCount", "rejectedCount", "droppedCount", "lastLogTime", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class PostponedFrameStatistics {
        private long deliveredCount;
        private long droppedCount;
        private long lastLogTime;
        private long postponedCount;
        private long rejectedCount;
        private long repostponedCount;

        private final void logStatisticsIfNeeded() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.lastLogTime < TextureViewRenderer.POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS) {
                return;
            }
            long j = this.postponedCount;
            double percent = j > 0 ? toPercent(this.deliveredCount / j) : 0.0d;
            long j2 = this.postponedCount;
            double percent2 = j2 > 0 ? toPercent(this.rejectedCount / j2) : 0.0d;
            long j3 = this.postponedCount;
            double percent3 = j3 > 0 ? toPercent(this.droppedCount / j3) : 0.0d;
            long j4 = this.postponedCount;
            long j5 = this.repostponedCount;
            long j6 = this.droppedCount;
            long j7 = this.deliveredCount;
            double d = percent2;
            long j8 = this.rejectedCount;
            StringBuilder sbK = au1.k(j4, "postponed: ", ", re-postponed: ");
            sbK.append(j5);
            au1.q(j6, ", dropped: ", " (", sbK);
            sbK.append(percent3);
            au1.q(j7, "%), delivered: ", " (", sbK);
            sbK.append(percent);
            au1.q(j8, "%), rejected: ", " (", sbK);
            sbK.append(d);
            sbK.append("%)");
            Logging.d("TextureViewRenderer_pfs", sbK.toString());
            this.repostponedCount = 0L;
            this.postponedCount = 0L;
            this.deliveredCount = 0L;
            this.rejectedCount = 0L;
            this.droppedCount = 0L;
            this.lastLogTime = jElapsedRealtime;
        }

        private final double toPercent(double value) {
            return tu0.H(value * 10000) / 100.0d;
        }

        public final void delivered() {
            this.deliveredCount++;
            logStatisticsIfNeeded();
        }

        public final void dropped() {
            this.droppedCount++;
            logStatisticsIfNeeded();
        }

        public final void postponed(boolean isPostponedFrame) {
            if (isPostponedFrame) {
                this.repostponedCount++;
            } else {
                this.postponedCount++;
            }
            logStatisticsIfNeeded();
        }

        public final void rejected() {
            this.rejectedCount++;
            logStatisticsIfNeeded();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "", "", "w", "h", "Le5f;", "onTextureSizeChanged", "(II)V", "onFrameSizeChanged", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface SizeChangeListener {
        void onFrameSizeChanged(int w, int h);

        void onTextureSizeChanged(int w, int h);
    }

    public TextureViewRenderer(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverPostponedFrame() {
        VideoFrame andSet = this.postponedFrame.getAndSet(null);
        if (andSet != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.postponedFrameSafeguard);
            }
            try {
                handleFrame(andSet, true);
            } finally {
                andSet.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dropPostponedFrameIfExists() {
        VideoFrame andSet = this.postponedFrame.getAndSet(null);
        if (andSet != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.deliverPostponedFrameRunnable);
                handler.removeCallbacks(this.postponedFrameSafeguard);
            }
            andSet.release();
            this.postponedFrameStatistics.dropped();
        }
    }

    private final String getResourceName() throws Resources.NotFoundException {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private final void handleFrame(VideoFrame frame, boolean isPostponedFrame) {
        VideoFrame.Buffer buffer = frame.getBuffer();
        if (!updateFrameDimensionsAndReportEvents(buffer.getWidth(), buffer.getHeight(), frame.getRotatedWidth(), frame.getRotatedHeight(), frame.getRotation(), isPostponedFrame)) {
            this.postponedFrameStatistics.rejected();
            return;
        }
        if (!this.layoutReadyToRender.get()) {
            logD("skipping frame for " + this + " - " + getId());
            if (isAttachedToWindow() && isShown()) {
                postponeFrame(frame, isPostponedFrame);
                return;
            }
            return;
        }
        if (this.isFirstFrameRendered.compareAndSet(false, true)) {
            logD("Reporting first rendered frame.");
            RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
            if (rendererEvents != null) {
                rendererEvents.onFirstFrameRendered();
            }
        }
        if (this.needsClearImage) {
            this.needsClearImage = false;
            this.videoRenderer.clearImage();
        }
        this.videoRenderer.onFrame(frame);
        dropPostponedFrameIfExists();
        if (isPostponedFrame) {
            this.postponedFrameStatistics.delivered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logD(String string) {
        Logging.d(TAG, this.resourceName + string);
    }

    private final void maybeReleaseLastSizeListener() {
        VideoRendererInterface.FrameSizeListener frameSizeListener = this.lastSizeListener;
        if (frameSizeListener != null) {
            this.videoRenderer.removeFrameSizeListener(frameSizeListener);
        }
        this.lastSizeListener = null;
    }

    private final void notifyTextureSizeChanged() {
        post(new ire(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextureSizeChanged$lambda$9(TextureViewRenderer textureViewRenderer) {
        SizeChangeListener sizeChangeListener = textureViewRenderer.sizeChangeListener;
        if (sizeChangeListener != null) {
            sizeChangeListener.onTextureSizeChanged(textureViewRenderer.textureWidth, textureViewRenderer.textureHeight);
        }
    }

    private final void postponeFrame(VideoFrame frame, boolean isPostponedFrame) {
        frame.retain();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.postponedFrameSafeguard);
        }
        VideoFrame andSet = this.postponedFrame.getAndSet(frame);
        if (andSet != null) {
            andSet.release();
            this.postponedFrameStatistics.dropped();
        }
        Handler handler2 = getHandler();
        if (handler2 != null) {
            handler2.postDelayed(this.postponedFrameSafeguard, POSTPONED_FRAME_SAFEGUARD_DELAY_MILLIS);
        }
        this.postponedFrameStatistics.postponed(isPostponedFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFrameSizeListener$lambda$2(a66 a66Var, int i, int i2) {
        a66Var.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final boolean updateFrameDimensionsAndReportEvents(int newWidth, int newHeight, int newRotatedFrameWidth, int newRotatedFrameHeight, int newFrameRotation, boolean isPostponedFrame) {
        if (!this.rotatedFrameSize.set(newRotatedFrameWidth, newRotatedFrameHeight, newFrameRotation, isPostponedFrame)) {
            return true;
        }
        if (isPostponedFrame) {
            return false;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.deliverPostponedFrameRunnable);
        }
        this.layoutReadyToRender.set(false);
        logD("Reporting frame resolution changed to " + newWidth + "x" + newHeight + " with rotation " + newFrameRotation);
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(newWidth, newHeight, newFrameRotation);
        }
        post(new ft0(this, newRotatedFrameWidth, newRotatedFrameHeight, 8));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFrameDimensionsAndReportEvents$lambda$8(TextureViewRenderer textureViewRenderer, int i, int i2) {
        SizeChangeListener sizeChangeListener = textureViewRenderer.sizeChangeListener;
        if (sizeChangeListener != null) {
            sizeChangeListener.onFrameSizeChanged(i, i2);
        }
        textureViewRenderer.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTextureSize(int width, int height) {
        this.textureWidth = width;
        this.textureHeight = height;
        notifyTextureSizeChanged();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void clearImage() {
        this.videoRenderer.clearImage();
        this.isFirstFrameRendered.set(false);
    }

    public final void disableFpsReduction() {
        this.videoRenderer.disableFpsReduction();
    }

    public final boolean getClearImageOnSizeChange() {
        return this.clearImageOnSizeChange;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean getHasImage() {
        return this.isFirstFrameRendered.get();
    }

    public final SizeChangeListener getSizeChangeListener() {
        return this.sizeChangeListener;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean getUseAlternateLayout() {
        return this.useAlternateLayout;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean init(oe1 renderer, RendererCommon.RendererEvents rendererEvents, RendererCommon.GlDrawer drawer) {
        if (this.isInitialized) {
            return false;
        }
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameSize.set(0, 0, 0, false);
        this.videoRenderer.init(renderer, drawer);
        this.isInitialized = true;
        return true;
    }

    /* renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame frame) {
        if (this.doRender) {
            VideoFrame videoFrameApply = this.frameDecorator.apply(frame);
            m56 m56Var = this.frameSkipPredicate;
            if (m56Var == null || !((Boolean) m56Var.invoke(frame)).booleanValue()) {
                handleFrame(videoFrameApply, false);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.videoRenderer.setLayoutAspectRatio((right - left) / (bottom - top));
        if (!this.layoutReadyToRender.compareAndSet(false, true) || getHandler() == null) {
            return;
        }
        removeCallbacks(this.deliverPostponedFrameRunnable);
        post(this.deliverPostponedFrameRunnable);
    }

    @Override // android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        Point pointMeasure;
        ThreadUtils.checkIsOnMainThread();
        this.rotatedFrameSize.get(this.measureFrameSize);
        if (getUseAlternateLayout()) {
            int size = View.MeasureSpec.getSize(heightSpec);
            int size2 = View.MeasureSpec.getSize(widthSpec);
            float fRatio = this.measureFrameSize.ratio();
            int i = (int) (size * fRatio);
            if (i <= size2) {
                size2 = i;
            }
            if (size2 > View.MeasureSpec.getSize(widthSpec) * 2) {
                size2 = View.MeasureSpec.getSize(widthSpec) * 2;
            }
            this.alternateLayoutOutPoint.set(size2, (int) (size2 / fRatio));
            pointMeasure = this.alternateLayoutOutPoint;
        } else {
            pointMeasure = this.videoLayoutMeasure.measure(widthSpec, heightSpec, this.measureFrameSize.getRotatedFrameWidth(), this.measureFrameSize.getRotatedFrameHeight());
        }
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
    }

    public final void pauseVideo() {
        this.videoRenderer.pauseVideo();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void release() {
        if (this.isReleased) {
            return;
        }
        dropPostponedFrameIfExists();
        this.rendererEvents = null;
        maybeReleaseLastSizeListener();
        this.videoRenderer.release();
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.isFirstFrameRendered.set(false);
        this.isReleased = true;
    }

    public final void setClearImageOnSizeChange(boolean z) {
        this.clearImageOnSizeChange = z;
    }

    public final void setFpsReduction(float fps) {
        this.videoRenderer.setFpsReduction(fps);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setFrameDecorator(FrameDecorator decorator) {
        this.frameDecorator = decorator;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setFrameSizeListener(final a66 listener) {
        maybeReleaseLastSizeListener();
        VideoRendererInterface videoRendererInterface = this.videoRenderer;
        VideoRendererInterface.FrameSizeListener frameSizeListener = new VideoRendererInterface.FrameSizeListener() { // from class: jre
            @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface.FrameSizeListener
            public final void onFrame(int i, int i2) {
                TextureViewRenderer.setFrameSizeListener$lambda$2(listener, i, i2);
            }
        };
        this.lastSizeListener = frameSizeListener;
        videoRendererInterface.addFrameSizeListener(frameSizeListener);
    }

    public final void setFrameSkipCondition(m56 frameSkipCondition) {
        this.frameSkipPredicate = frameSkipCondition;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setMirror(boolean mirror) {
        this.videoRenderer.setMirror(mirror);
    }

    public final void setRender(boolean doRender) {
        this.doRender = doRender;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setRenderEventsListener(RendererCommon.RendererEvents listener) {
        this.rendererEvents = listener;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
    }

    public final void setSizeChangeListener(SizeChangeListener sizeChangeListener) {
        this.sizeChangeListener = sizeChangeListener;
        notifyTextureSizeChanged();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setUseAlternateLayout(boolean z) {
        this.useAlternateLayout = z;
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.videoRenderer = VideoRendererInterface.INSTANCE.createRenderer(resourceName);
        this.isFirstFrameRendered = new AtomicBoolean(false);
        this.rotatedFrameSize = new FrameSize(0, 0, 0, 7, null);
        this.measureFrameSize = new FrameSize(0, 0, 0, 7, null);
        this.doRender = true;
        this.layoutReadyToRender = new AtomicBoolean(false);
        this.postponedFrame = new AtomicReference<>(null);
        this.postponedFrameSafeguard = new ire(this, 1);
        this.deliverPostponedFrameRunnable = new ire(this, 2);
        this.frameDecorator = FrameDecorator.INSTANCE.getEMPTY();
        this.alternateLayoutOutPoint = new Point();
        this.postponedFrameStatistics = new PostponedFrameStatistics();
        this.clearImageOnSizeChange = true;
        setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
                ThreadUtils.checkIsOnMainThread();
                Surface surface = TextureViewRenderer.this.surface;
                if (surface != null) {
                    surface.release();
                }
                TextureViewRenderer.this.surface = null;
                TextureViewRenderer textureViewRenderer = TextureViewRenderer.this;
                Surface surface2 = new Surface(surfaceTexture);
                TextureViewRenderer.this.videoRenderer.createEglSurface(surface2);
                textureViewRenderer.surface = surface2;
                TextureViewRenderer.this.updateTextureSize(width, height);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                ThreadUtils.checkIsOnMainThread();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                TextureViewRenderer.this.videoRenderer.releaseEglSurface(new TextureViewRenderer$1$onSurfaceTextureDestroyed$1(countDownLatch));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                Surface surface = TextureViewRenderer.this.surface;
                if (surface != null) {
                    surface.release();
                }
                TextureViewRenderer.this.surface = null;
                TextureViewRenderer.this.updateTextureSize(0, 0);
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
                ThreadUtils.checkIsOnMainThread();
                TextureViewRenderer.this.logD("surfaceChanged: size: " + width + "x" + height);
                TextureViewRenderer.this.updateTextureSize(width, height);
                if (TextureViewRenderer.this.getClearImageOnSizeChange()) {
                    TextureViewRenderer.this.needsClearImage = true;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setScalingType(RendererCommon.ScalingType scalingTypeMatchOrientation, RendererCommon.ScalingType scalingTypeMismatchOrientation) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingTypeMatchOrientation, scalingTypeMismatchOrientation);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean init(oe1 renderer, RendererCommon.RendererEvents rendererEvents, FrameDecorator frameDecorator) {
        this.frameDecorator = frameDecorator;
        return init(renderer, rendererEvents, new GlRectDrawer());
    }

    public /* synthetic */ TextureViewRenderer(Context context, AttributeSet attributeSet, int i, int i2, z84 z84Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
