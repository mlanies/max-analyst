package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class p9e {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        new DecimalFormat("0.0").setRoundingMode(roundingMode);
    }
}
