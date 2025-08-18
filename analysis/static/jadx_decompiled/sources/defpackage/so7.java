package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class so7 extends jp7 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so7(Executor executor, y7g y7gVar, Object obj, int i) {
        super(executor, y7gVar);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.jp7
    public final g05 d(wv6 wv6Var) throws Resources.NotFoundException, NumberFormatException, IOException {
        int length;
        int length2;
        String path;
        switch (this.c) {
            case 0:
                String strSubstring = wv6Var.b.getPath().substring(1);
                AssetManager assetManager = (AssetManager) this.d;
                InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    assetFileDescriptorOpenFd = assetManager.openFd(wv6Var.b.getPath().substring(1));
                    length = (int) assetFileDescriptorOpenFd.getLength();
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused3) {
                        }
                    }
                    length = -1;
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
                return c(inputStreamOpen, length);
            default:
                String path2 = wv6Var.b.getPath();
                if (path2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                int i = Integer.parseInt(path2.substring(1));
                Resources resources = (Resources) this.d;
                InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                AssetFileDescriptor assetFileDescriptor = null;
                try {
                    path = wv6Var.b.getPath();
                } catch (Resources.NotFoundException unused5) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused6) {
                        }
                    }
                    length2 = -1;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th2;
                }
                if (path == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path.substring(1)));
                length2 = (int) assetFileDescriptorOpenRawResourceFd.getLength();
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused8) {
                }
                return c(inputStreamOpenRawResource, length2);
        }
    }

    @Override // defpackage.jp7
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalAssetFetchProducer";
            default:
                return "LocalResourceFetchProducer";
        }
    }
}
