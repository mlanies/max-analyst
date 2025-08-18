package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class zs3 implements ys3, at3 {
    public Uri X;
    public Bundle Y;
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int o;

    public /* synthetic */ zs3() {
    }

    @Override // defpackage.ys3
    public void b(Uri uri) {
        this.X = uri;
    }

    @Override // defpackage.ys3
    public bt3 build() {
        return new bt3(new zs3(this));
    }

    @Override // defpackage.at3
    public ClipData c() {
        return this.b;
    }

    @Override // defpackage.ys3
    public void d(ClipData clipData) {
        this.b = clipData;
    }

    @Override // defpackage.at3
    public Uri g() {
        return this.X;
    }

    @Override // defpackage.at3
    public Bundle getExtras() {
        return this.Y;
    }

    @Override // defpackage.at3
    public int getFlags() {
        return this.o;
    }

    @Override // defpackage.at3
    public ContentInfo p() {
        return null;
    }

    @Override // defpackage.at3
    public int r() {
        return this.c;
    }

    @Override // defpackage.ys3
    public void setExtras(Bundle bundle) {
        this.Y = bundle;
    }

    @Override // defpackage.ys3
    public void setFlags(int i) {
        this.o = i;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.o;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = this.X;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return zr6.l(sb, this.Y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public zs3(zs3 zs3Var) {
        ClipData clipData = zs3Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = zs3Var.c;
        c54.l(i, "source", 0, 5);
        this.c = i;
        int i2 = zs3Var.o;
        if ((i2 & 1) == i2) {
            this.o = i2;
            this.X = zs3Var.X;
            this.Y = zs3Var.Y;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
