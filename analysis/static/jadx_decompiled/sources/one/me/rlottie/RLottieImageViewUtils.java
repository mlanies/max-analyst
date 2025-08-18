package one.me.rlottie;

import defpackage.he;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001e\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u0011\u0010\u001f\u001a\u00020\u001a*\u00020\u0000¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lone/me/rlottie/RLottieImageView;", "", "assetsResName", "", "width", "height", "", "autoRepeat", "setAssetsRes", "(Lone/me/rlottie/RLottieImageView;Ljava/lang/String;IIZ)Z", "rawResId", "cacheName", "setRawRes", "(Lone/me/rlottie/RLottieImageView;ILjava/lang/String;II)Z", "Ljava/io/File;", "file", "setFile", "(Lone/me/rlottie/RLottieImageView;Ljava/io/File;II)Z", "url", "setUrl", "(Lone/me/rlottie/RLottieImageView;Ljava/lang/String;II)Z", "Lone/me/rlottie/RLottieDrawable;", "lottieDrawable", "setLottieDrawable", "(Lone/me/rlottie/RLottieImageView;Lone/me/rlottie/RLottieDrawable;)Z", "networkFetchEnabled", "Le5f;", "restartDownloadFromUrl", "(Lone/me/rlottie/RLottieImageView;Z)V", "debug", "setDebug", "release", "(Lone/me/rlottie/RLottieImageView;)V", "rlottie_release"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class RLottieImageViewUtils {
    public static final void release(RLottieImageView rLottieImageView) throws InterruptedException, IOException {
        rLottieImageView.stopAnimation();
        RLottieDrawable rLottieDrawable = rLottieImageView.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.recycle(he.b());
        }
        rLottieImageView.clearAnimationDrawable();
    }

    public static final void restartDownloadFromUrl(RLottieImageView rLottieImageView, boolean z) {
        RLottieDrawable rLottieDrawable = rLottieImageView.s0;
        if (rLottieDrawable != null) {
            RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, z);
        }
    }

    public static final boolean setAssetsRes(RLottieImageView rLottieImageView, String str, int i, int i2, boolean z) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByAsset$default(rLottieImageView.getContext(), str, null, i, i2, false, z, false, false, false, 900, null));
    }

    public static final void setDebug(RLottieImageView rLottieImageView, boolean z) {
    }

    public static final boolean setFile(RLottieImageView rLottieImageView, File file, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByFile$default(file, false, i, i2, false, false, false, false, 242, null));
    }

    public static final boolean setLottieDrawable(RLottieImageView rLottieImageView, RLottieDrawable rLottieDrawable) throws InterruptedException {
        RLottieDrawable rLottieDrawable2 = rLottieImageView.s0;
        if (rLottieDrawable2 != null && rLottieDrawable2 == rLottieDrawable) {
            return false;
        }
        rLottieImageView.setImageDrawable(rLottieDrawable);
        return true;
    }

    public static final boolean setRawRes(RLottieImageView rLottieImageView, int i, String str, int i2, int i3) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByRawRes$default(i, str, i2, i3, false, false, false, false, false, 496, null));
    }

    public static final boolean setUrl(RLottieImageView rLottieImageView, String str, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByUrl$default(str, i, i2, false, false, false, false, false, false, HttpStatus.SC_GATEWAY_TIMEOUT, null));
    }
}
