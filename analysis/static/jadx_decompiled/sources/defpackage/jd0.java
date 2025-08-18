package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes2.dex */
public final class jd0 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
