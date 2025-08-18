package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h5c implements Parcelable {
    public static final Parcelable.Creator<h5c> CREATOR = new e9b(10);
    public final int a;
    public final float b;
    public Object c;

    public h5c(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static h5c a(Object obj) {
        h5c h5cVar;
        h5c h5cVar2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        h5cVar2 = new h5c(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        h5cVar = new h5c(1, rating.hasHeart() ? 1.0f : 0.0f);
                        h5cVar2 = h5cVar;
                        break;
                    case 2:
                        h5cVar = new h5c(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        h5cVar2 = h5cVar;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        h5cVar2 = d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            h5cVar2 = new h5c(6, percentRating);
                            break;
                        }
                        break;
                    default:
                        return null;
                }
            }
            h5cVar2.getClass();
            h5cVar2.c = obj;
        }
        return h5cVar2;
    }

    public static h5c d(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                return null;
            }
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new h5c(i, f);
    }

    public final float b() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
