package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class jqe implements Parcelable {
    public static final iqe a = new iqe("");

    public final CharSequence a(dec decVar) {
        return c(decVar.a.getContext().getResources());
    }

    public final CharSequence b(Context context) {
        return c(context.getResources());
    }

    public final CharSequence c(Resources resources) {
        if (this instanceof eqe) {
            return resources.getString(((eqe) this).b);
        }
        if (this instanceof gqe) {
            gqe gqeVar = (gqe) this;
            Object[] array = gqeVar.c.toArray(new Object[0]);
            return resources.getString(gqeVar.b, Arrays.copyOf(array, array.length));
        }
        if (this instanceof aqe) {
            aqe aqeVar = (aqe) this;
            int i = aqeVar.c;
            return resources.getQuantityString(aqeVar.b, i, Integer.valueOf(i));
        }
        if (this instanceof iqe) {
            return ((iqe) this).b;
        }
        if (!(this instanceof cqe)) {
            throw new NoWhenBranchMatchedException();
        }
        cqe cqeVar = (cqe) this;
        Object[] array2 = cqeVar.o.toArray(new Object[0]);
        return resources.getQuantityString(cqeVar.b, cqeVar.c, Arrays.copyOf(array2, array2.length));
    }

    public final CharSequence d(View view) {
        return c(view.getContext().getResources());
    }
}
