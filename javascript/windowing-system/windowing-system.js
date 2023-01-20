// @ts-check

/**
 * Implement the classes etc. that are needed to solve the
 * exercise in this file. Do not forget to export the entities
 * you defined so they are available for the tests.
 */
export class Size {
    constructor(width = 80, height = 60) {
        this.resize(width, height);
    }

    resize(width, height) {
        this.width = width;
        this.height = height;
    }
}

export class Position {
    constructor(x = 0, y = 0) {
        this.move(x, y);
    }

    move(x, y) {
        this.x = x;
        this.y = y;
    }
}

export class ProgramWindow {
    constructor() {
        this.size = new Size();
        this.position = new Position();
        this.screenSize = new Size(800, 600);
    }

    resize(newSize) {
        if(newSize.width < 1) newSize.width = 1;
        if(newSize.height < 1) newSize.height = 1;
        if(newSize.width > this.screenSize.width) {
            newSize.width = this.screenSize.width - this.position.x;
        }
        if(newSize.height > this.screenSize.height) {
            newSize.height = this.screenSize.height - this.position.y;
        }
        this.size = newSize;
    }

    move(newPosition){
        if(newPosition.x < 0) newPosition.x = 0;
        if(newPosition.y < 0) newPosition.y = 0;
        if(newPosition.x + this.size.width > this.screenSize.width) {
            newPosition.x = this.screenSize.width - this.size.width;
        }
        if(newPosition.y + this.size.height > this.screenSize.height) {
            newPosition.y = this.screenSize.height - this.size.height;
        }
        this.position = newPosition;
    }
}

export function changeWindow(ProgramWindown) {
    const newSize = new Size(400, 300);
    const newPosition = new Position(100, 150);

    ProgramWindown.resize(newSize);
    ProgramWindown.move(newPosition);

    return ProgramWindown;
}
