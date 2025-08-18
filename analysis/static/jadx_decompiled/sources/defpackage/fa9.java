package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.logout.a;

/* loaded from: classes2.dex */
public final class fa9 extends da9 {
    public final a c;
    public final jp4 d;

    public fa9(a aVar, jp4 jp4Var) {
        super(1, 2);
        this.c = aVar;
        this.d = jp4Var;
    }

    @Override // defpackage.da9
    public final void a(k36 k36Var) {
        hm9.n("Migration_1_2", "start");
        uz2 uz2Var = new uz2(this.d);
        ArrayList arrayList = new ArrayList();
        k36Var.m();
        try {
            Cursor cursorQ0 = k36Var.q0("SELECT * FROM chats");
            try {
                int columnIndex = cursorQ0.getColumnIndex("id");
                int columnIndex2 = cursorQ0.getColumnIndex("data");
                while (cursorQ0.moveToNext()) {
                    if (!cursorQ0.isNull(columnIndex2)) {
                        long j = cursorQ0.getLong(columnIndex);
                        try {
                            arrayList.add(new Long[]{Long.valueOf(uz2Var.a(cursorQ0.getBlob(columnIndex2)).l), Long.valueOf(j)});
                        } catch (Throwable unused) {
                            hm9.m0("Migration_1_2", "could not parse blob for chat #" + j, new Object[0]);
                        }
                    }
                }
                v3c.i(cursorQ0, null);
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        if (arrayList.isEmpty()) {
            k36Var.r0();
            hm9.n("Migration_1_2", "no data, finished!");
            return;
        }
        k36Var.U("DROP INDEX IF EXISTS index_chats_server_id");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
        k36Var.U("ALTER TABLE chats ADD COLUMN cid INTEGER NOT NULL DEFAULT 0");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k36Var.e0("UPDATE chats SET cid = ? WHERE id = ?", (Long[]) it.next());
        }
        k36Var.U("CREATE TABLE IF NOT EXISTS `temp_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `constructor_id` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        k36Var.U("INSERT INTO temp_messages SELECT * FROM messages");
        k36Var.U("DROP TABLE messages");
        k36Var.U("ALTER TABLE temp_messages RENAME TO messages");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
        k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
        k36Var.r0();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "Migration_1_2", "finish! migrate " + arrayList.size() + " chats", null);
        }
    }
}
