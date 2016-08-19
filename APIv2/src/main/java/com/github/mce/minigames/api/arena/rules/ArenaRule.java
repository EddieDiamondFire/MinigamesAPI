/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.github.mce.minigames.api.arena.rules;

import org.bukkit.event.Event;

import com.github.mce.minigames.api.MinigameException;

/**
 * A single arena rule.
 * 
 * @author mepeisen
 * 
 * @param <Evt> Bukkit Event class
 * @param <MgEvt> Minigame event class
 */
public interface ArenaRule<Evt extends Event, MgEvt extends MinigameEvent<Evt>>
{
    
    void passEvent(MgEvt event) throws MinigameException;
    
}