package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.ImageInfoImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ei0 implements l43 {
    public static final HashSet c = new HashSet(Arrays.asList(HasExtraData.KEY_ENCODED_SIZE, HasExtraData.KEY_ENCODED_WIDTH, HasExtraData.KEY_ENCODED_HEIGHT, HasExtraData.KEY_URI_SOURCE, HasExtraData.KEY_IMAGE_FORMAT, HasExtraData.KEY_BITMAP_CONFIG, HasExtraData.KEY_IS_ROUNDED, HasExtraData.KEY_NON_FATAL_DECODE_ERROR, HasExtraData.KEY_ORIGINAL_URL, HasExtraData.KEY_MODIFIED_URL, HasExtraData.KEY_COLOR_SPACE));
    public final HashMap a = new HashMap();
    public ImageInfoImpl b;

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return getExtra(str, null);
    }

    @Override // defpackage.ru6, com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.a;
    }

    @Override // defpackage.l43
    public final ru6 getImageInfo() {
        if (this.b == null) {
            this.b = new ImageInfoImpl(getWidth(), getHeight(), getSizeInBytes(), getQualityInfo(), this.a);
        }
        return this.b;
    }

    @Override // defpackage.l43
    public pqb getQualityInfo() {
        return hx6.d;
    }

    @Override // defpackage.l43
    public boolean isStateful() {
        return false;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (c.contains(str)) {
            this.a.put(str, obj);
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj != null) {
                this.a.put(str, obj);
            }
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.a.get(str);
        return obj2 == null ? obj : obj2;
    }
}
