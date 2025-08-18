package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class c86 implements ol7 {
    public final b86 a;
    public final Uri b;
    public final boolean c;
    public final long o;

    public c86(b86 b86Var, Uri uri, boolean z) {
        this.a = b86Var;
        this.b = uri;
        this.c = z;
        this.o = b86Var.a.b().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c86)) {
            return false;
        }
        c86 c86Var = (c86) obj;
        return tpa.f(this.a, c86Var.a) && tpa.f(this.b, c86Var.b) && this.c == c86Var.c;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryAlbumUiItem(album=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return au1.j(sb, this.c, ")");
    }
}
