package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class f73 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ f73(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.a) {
            case 0:
                return new h73(parcel);
            case 1:
                int i2 = parcel.readInt();
                jqe jqeVar = (jqe) parcel.readParcelable(mg3.class.getClassLoader());
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("NEGATIVE")) {
                    i = 1;
                } else if (string.equals("NEUTRAL")) {
                    i = 2;
                } else if (string.equals("PRIMARY")) {
                    i = 3;
                } else {
                    if (!string.equals("THEMED")) {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Type.".concat(string));
                    }
                    i = 4;
                }
                return new mg3(i2, jqeVar, i, parcel.readInt() != 0);
            case 2:
                return new an3(parcel);
            case 3:
                return new tp3(parcel);
            case 4:
                return new nz3(parcel);
            case 5:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(parcel.readBundle(o04.class.getClassLoader()));
                }
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new o04(arrayList, arrayList2, arrayList3, parcel.readInt());
            case 6:
                x34 x34VarCreateFromParcel = x34.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<qte> creator = qte.CREATOR;
                return new m34(x34VarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 7:
                return new v34(parcel.readLong());
            case 8:
                return new x34(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString());
            case 9:
                return new m64((Uri) parcel.readParcelable(m64.class.getClassLoader()));
            case 10:
                return new vo4(parcel);
            case 11:
                return new yq4(parcel);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new cr4(parcel);
            case 13:
                return new dr4(parcel);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ar4(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new br4(parcel);
            case 16:
                return new ov4(parcel);
            case LangUtils.HASH_SEED /* 17 */:
                return new c45(parcel);
            case 18:
                return new d45(parcel);
            case 19:
                return new bm5(parcel);
            case 20:
                bn5 bn5Var = new bn5(-2, -2);
                bn5Var.X = 0.0f;
                bn5Var.Y = 1.0f;
                bn5Var.Z = -1;
                bn5Var.s0 = -1.0f;
                bn5Var.v0 = 16777215;
                bn5Var.w0 = 16777215;
                bn5Var.X = parcel.readFloat();
                bn5Var.Y = parcel.readFloat();
                bn5Var.Z = parcel.readInt();
                bn5Var.s0 = parcel.readFloat();
                bn5Var.t0 = parcel.readInt();
                bn5Var.u0 = parcel.readInt();
                bn5Var.v0 = parcel.readInt();
                bn5Var.w0 = parcel.readInt();
                bn5Var.x0 = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) bn5Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) bn5Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) bn5Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) bn5Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) bn5Var).width = parcel.readInt();
                return bn5Var;
            case 21:
                cn5 cn5Var = new cn5();
                cn5Var.a = parcel.readInt();
                cn5Var.b = parcel.readInt();
                return cn5Var;
            case 22:
                i16 i16Var = new i16();
                i16Var.a = parcel.readString();
                i16Var.b = parcel.readInt();
                return i16Var;
            case 23:
                return new o16(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new r16(parcel);
            case 25:
                return new q76(parcel.readInt());
            case 26:
                return new r76(parcel.readString());
            case 27:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList4.add(parcel.readParcelable(d86.class.getClassLoader()));
                }
                return new d86(z, z2, z3, z4, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                return new qa6(parcel);
            default:
                return new ra6(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h73[i];
            case 1:
                return new mg3[i];
            case 2:
                return new an3[i];
            case 3:
                return new tp3[i];
            case 4:
                return new nz3[i];
            case 5:
                return new o04[i];
            case 6:
                return new m34[i];
            case 7:
                return new v34[i];
            case 8:
                return new x34[i];
            case 9:
                return new m64[i];
            case 10:
                return new vo4[i];
            case 11:
                return new yq4[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new cr4[i];
            case 13:
                return new dr4[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ar4[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new br4[i];
            case 16:
                return new ov4[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new c45[i];
            case 18:
                return new d45[i];
            case 19:
                return new bm5[i];
            case 20:
                return new bn5[i];
            case 21:
                return new cn5[i];
            case 22:
                return new i16[i];
            case 23:
                return new o16[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new r16[i];
            case 25:
                return new q76[i];
            case 26:
                return new r76[i];
            case 27:
                return new d86[i];
            case 28:
                return new qa6[i];
            default:
                return new ra6[i];
        }
    }
}
