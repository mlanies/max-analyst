package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* loaded from: classes.dex */
public final class rd implements ov6 {
    public final Image a;
    public final sy4[] b;
    public final ra0 c;

    public rd(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new sy4[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new sy4(2, planes[i]);
            }
        } else {
            this.b = new sy4[0];
        }
        this.c = new ra0(nje.b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // defpackage.ov6
    public final Image Z() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ov6
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.ov6
    public final su6 getImageInfo() {
        return this.c;
    }

    @Override // defpackage.ov6
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // defpackage.ov6
    public final int k0() {
        return this.a.getFormat();
    }

    @Override // defpackage.ov6
    public final sy4[] v() {
        return this.b;
    }
}
