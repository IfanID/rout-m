package respawn.outbase

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents
import net.minecraft.text.Text
import org.slf4j.LoggerFactory

object Rout : ModInitializer {
    private val logger = LoggerFactory.getLogger("rout")

    override fun onInitialize() {
        // This code registers an event listener.
        // It will fire each time a player joins the game.
        logger.info("Registering event to send a message when a player joins.")

        ServerPlayConnectionEvents.JOIN.register { handler, _, _ ->
            // Send a message to the player's in-game chat.
            handler.player.sendMessage(Text.literal("ROut Mod On!"))
        }
    }
}
