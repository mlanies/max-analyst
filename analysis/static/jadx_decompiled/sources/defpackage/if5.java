package defpackage;

import one.me.sdk.media.ffmpeg.FfmpegLibraryLoader;
import one.me.sdk.media.ffmpeg.WebmConfig;

/* loaded from: classes2.dex */
public final /* synthetic */ class if5 implements FfmpegLibraryLoader {
    @Override // one.me.sdk.media.ffmpeg.FfmpegLibraryLoader
    public final void load(String str) {
        try {
            System.loadLibrary("ffmpg");
        } catch (Throwable th) {
            WebmConfig.getLogger().o(th);
        }
    }
}
