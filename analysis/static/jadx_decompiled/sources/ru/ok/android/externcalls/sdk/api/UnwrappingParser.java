package ru.ok.android.externcalls.sdk.api;

import defpackage.db7;
import defpackage.za7;
import defpackage.zr6;
import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;

/* loaded from: classes2.dex */
public final class UnwrappingParser<T> implements za7 {
    private final String fieldName;
    private final za7 valueParser;

    public UnwrappingParser(String str, za7 za7Var) {
        this.fieldName = str;
        this.valueParser = za7Var;
    }

    @Override // defpackage.za7
    public T parse(db7 db7Var) throws JsonParseException, IOException {
        db7Var.s();
        T t = null;
        while (db7Var.hasNext()) {
            if (this.fieldName.equals(db7Var.T())) {
                t = (T) this.valueParser.parse(db7Var);
            }
        }
        db7Var.q();
        if (t != null) {
            return t;
        }
        throw new JsonParseException(zr6.l(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
