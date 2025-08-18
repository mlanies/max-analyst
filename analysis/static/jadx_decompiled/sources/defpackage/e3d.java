package defpackage;

/* loaded from: classes2.dex */
public final class e3d {
    public final boolean a;
    public final boolean b;

    public e3d(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3d)) {
            return false;
        }
        e3d e3dVar = (e3d) obj;
        return this.a == e3dVar.a && this.b == e3dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAlbumMode(onlyPhotoAlbums=");
        sb.append(this.a);
        sb.append(", showEmptyAlbums=");
        return au1.j(sb, this.b, ")");
    }
}
