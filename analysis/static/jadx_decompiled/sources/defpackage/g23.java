package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g23 implements o99 {
    public static final Logger a = Logger.getLogger(g23.class.getName());

    @Override // defpackage.o99
    public final InputStream a(String str) {
        InputStream resourceAsStream = g23.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
