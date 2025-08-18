package ru.ok.tamtam.android.util.share;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.e9b;
import defpackage.vjd;
import defpackage.z84;
import defpackage.zr6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ok/tamtam/android/util/share/ShareData;", "Landroid/os/Parcelable;", "", "type", "", "Landroid/net/Uri;", "images", "videos", "", "text", "shares", "files", "vcard", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "Le5f;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "I", "Ljava/util/List;", "Ljava/lang/String;", "", "isSingleMedia", "()Z", "Companion", "vjd", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ShareData implements Parcelable {
    public static final int FILES = 4;
    public static final int IMAGES = 1;
    public static final int SHARES = 3;
    public static final int TEXT = 0;
    public static final int VCARD = 5;
    public static final int VIDEOS = 2;
    public List<Uri> files;
    public List<Uri> images;
    public List<Uri> shares;
    public String text;
    public int type;
    public String vcard;
    public List<Uri> videos;
    public static final vjd Companion = new vjd();
    public static final Parcelable.Creator<ShareData> CREATOR = new e9b(26);

    public ShareData() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean isSingleMedia() {
        int i = this.type;
        if (i != 1 && i != 2 && i != 4 && i != 3) {
            return false;
        }
        List<Uri> list = this.images;
        int size = list != null ? list.size() : 0;
        List<Uri> list2 = this.videos;
        int size2 = size + (list2 != null ? list2.size() : 0);
        List<Uri> list3 = this.files;
        int size3 = size2 + (list3 != null ? list3.size() : 0);
        List<Uri> list4 = this.shares;
        return size3 + (list4 != null ? list4.size() : 0) == 1;
    }

    public String toString() {
        int i = this.type;
        List<Uri> list = this.images;
        List<Uri> list2 = this.videos;
        String str = this.text;
        List<Uri> list3 = this.shares;
        List<Uri> list4 = this.files;
        String str2 = this.vcard;
        StringBuilder sb = new StringBuilder("ShareData{type=");
        sb.append(i);
        sb.append(", images=");
        sb.append(list);
        sb.append(", videos=");
        sb.append(list2);
        sb.append(", text='");
        sb.append(str);
        sb.append("', shares=");
        sb.append(list3);
        sb.append(", files=");
        sb.append(list4);
        sb.append(", vcard='");
        return zr6.l(sb, str2, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.type);
        List<Uri> list = this.images;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<Uri> list2 = this.videos;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<Uri> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
        }
        dest.writeString(this.text);
        List<Uri> list3 = this.shares;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator<Uri> it3 = list3.iterator();
            while (it3.hasNext()) {
                dest.writeParcelable(it3.next(), flags);
            }
        }
        List<Uri> list4 = this.files;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator<Uri> it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeParcelable(it4.next(), flags);
            }
        }
        dest.writeString(this.vcard);
    }

    public ShareData(int i, List<Uri> list, List<Uri> list2, String str, List<Uri> list3, List<Uri> list4, String str2) {
        this.type = i;
        this.images = list;
        this.videos = list2;
        this.text = str;
        this.shares = list3;
        this.files = list4;
        this.vcard = str2;
    }

    public /* synthetic */ ShareData(int i, List list, List list2, String str, List list3, List list4, String str2, int i2, z84 z84Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4, (i2 & 64) == 0 ? str2 : null);
    }
}
