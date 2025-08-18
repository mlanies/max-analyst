package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.rlottie.RLottieImageView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class n71 extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public static final n71 b = new n71(1, 0);
    public static final n71 c = new n71(1, 1);
    public static final n71 o = new n71(1, 2);
    public static final n71 X = new n71(1, 3);
    public static final n71 Y = new n71(1, 4);
    public static final n71 Z = new n71(1, 5);
    public static final n71 s0 = new n71(1, 6);
    public static final n71 t0 = new n71(1, 7);
    public static final n71 u0 = new n71(1, 8);
    public static final n71 v0 = new n71(1, 9);
    public static final n71 w0 = new n71(1, 10);
    public static final n71 x0 = new n71(1, 11);
    public static final n71 y0 = new n71(1, 12);
    public static final n71 z0 = new n71(1, 13);
    public static final n71 A0 = new n71(1, 14);
    public static final n71 B0 = new n71(1, 15);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n71(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof rma);
            case 1:
                return Boolean.valueOf(obj instanceof hl6);
            case 2:
                return Boolean.valueOf(obj instanceof gb1);
            case 3:
                return Boolean.valueOf(obj instanceof ue1);
            case 4:
                StringBuilder sb = new StringBuilder("- ");
                sb.append("Object(type=" + ((Class) obj).getName() + ')');
                return sb.toString();
            case 5:
                return Boolean.valueOf(obj instanceof RLottieImageView);
            case 6:
                return ((c6d) obj).iterator();
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                return obj;
            case 9:
                return Boolean.valueOf(obj == null);
            case 10:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 11:
                return ((yye) obj).getClass().getName();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((zye) obj).getClass().getName();
            case 13:
                return Boolean.valueOf(obj instanceof RecyclerView);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                Object tag = ((View) obj).getTag(ayb.view_tree_lifecycle_owner);
                if (tag instanceof eh7) {
                    return (eh7) tag;
                }
                return null;
        }
    }
}
